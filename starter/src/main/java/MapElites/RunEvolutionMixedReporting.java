package MapElites;

import Evolution.GeneticAlgorithm;
import Evolution.GeneticAlgorithm2;
import Evolution.Population;
import Evolution.Rulebase;

/**
 * Main, executive class for the Traveling Salesman Problem.
 * 
 * We don't have a real list of cities, so we randomly generate a number of them
 * on a 100x100 map.
 * 
 * The TSP requires that each city is visited once and only once, so we have to
 * be careful when initializing a random Individual and also when applying
 * crossover and mutation. Check out the GeneticAlgorithm class for
 * implementations of crossover and mutation for this problem.
 * 
 * @author bkanber
 *
 */
public class RunEvolutionMixedReporting {
	public static int maxGenerations = 500; // note : generation count starts at zero, so this is actually 1000
	public static int populationSize = 100;
	public static double mutationRate = 0.1;
	public static double crossoverRate = 0.9;
    public static int elitismCount = 20;
	public static  int tournamentSize = 5;
	public static int numGames = 20; // Number of games per agent per game size. There are 4 different game sizes, so this number is actually 4 times higher
	public static boolean mirror = false; // If true, will run in mirror mode. If false, will run in mixed mode, which is takes around 7 times as long
	static int minNumPlayers = 2;
	static int maxNumPlayers = 2;
	static boolean rulebaseStandard = false;
	
	
	public static void main(String[] args) {
		Rulebase rb = new Rulebase(rulebaseStandard);
		// Create cities
		int numRules = rb.getRuleset().length;
		int chromossomeLength = numRules;
//		City cities[] = new City[numRules];
//		
//		// Loop to create random cities
//		for (int cityIndex = 0; cityIndex < numRules; cityIndex++) {
//			// Generate x,y position
//			int xPos = (int) (100 * Math.random());
//			int yPos = (int) (100 * Math.random());
//			
//			// Add city
//			cities[cityIndex] = new City(xPos, yPos);
//		}

		
		
		// Initial GA
		GeneticAlgorithm2 ga = new GeneticAlgorithm2(populationSize, mutationRate, crossoverRate, elitismCount, tournamentSize);

		// Initialize population
		Population population = ga.initPopulation(chromossomeLength, numRules);

		// Evaluate population
		ga.evalPopulation(population, numRules, mirror, null, minNumPlayers, maxNumPlayers, rulebaseStandard);

		//Route startRoute = new Route(population.getFittest(0), cities);
		//System.out.println("Start Distance: " + startRoute.getDistance());

		// Keep track of current generation
		int generation = 1;
		// Start evolution loop
		while (ga.isTerminationConditionMet(generation, maxGenerations) == false) {
			// Print fittest individual from population
			//Route route = new Route(population.getFittest(0), cities);
			//System.out.println("G"+generation+" Best distance: " + route.getDistance());

			// Apply crossover
			population = ga.crossoverPopulation(population);

			// Apply mutation
			population = ga.mutatePopulation(population);

			// Evaluate population
			System.out.println("Evaluating fitness after generation " + generation);
			ga.evalPopulation(population, numRules, mirror, null, minNumPlayers, maxNumPlayers, rulebaseStandard);
			ga.printFittestPerGeneration();
			

			// Increment the current generation
			generation++;
		}
		
		//System.out.println("Stopped after " + maxGenerations + " generations.");
		//Route route = new Route(population.getFittest(0));
		//System.out.println("Best distance: " + route.getDistance());

	}
}
