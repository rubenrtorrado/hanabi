package Evolution;

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
public class TSP {
//	public static int maxGenerations = 5;
//	public static int populationSize = 5;
//	public static double mutationRate = 0.001;
//	public static double crossoverRate = 0.9;
//    public static int elitismCount = 10;
//	public static  int tournamentSize = 5;
//	public static int numGames = 20;
//	public static boolean mirror = true;
//	static int minNumPlayers = 2;
//	static int maxNumPlayers = 5;
//	static boolean rulebaseStandard = false;
//	public static void main(String[] args) {
//		
//		// Create cities
//		int numRules = RulebaseExtended.getRuleset().length;
////		City cities[] = new City[numRules];
////		
////		// Loop to create random cities
////		for (int cityIndex = 0; cityIndex < numRules; cityIndex++) {
////			// Generate x,y position
////			int xPos = (int) (100 * Math.random());
////			int yPos = (int) (100 * Math.random());
////			
////			// Add city
////			cities[cityIndex] = new City(xPos, yPos);
////		}
//
//		
//		
//		// Initial GA
//		GeneticAlgorithm ga = new GeneticAlgorithm(populationSize, mutationRate, crossoverRate, elitismCount, tournamentSize);
//
//		// Initialize population
//		Population population = ga.initPopulation(numRules);
//
//		// Evaluate population
//		ga.evalPopulation(population, numRules, mirror, null, minNumPlayers, maxNumPlayers, rulebaseStandard);
//
//		//Route startRoute = new Route(population.getFittest(0), cities);
//		//System.out.println("Start Distance: " + startRoute.getDistance());
//
//		// Keep track of current generation
//		int generation = 1;
//		// Start evolution loop
//		while (ga.isTerminationConditionMet(generation, maxGenerations) == false) {
//			// Print fittest individual from population
//			//Route route = new Route(population.getFittest(0), cities);
//			//System.out.println("G"+generation+" Best distance: " + route.getDistance());
//
//			// Apply crossover
//			population = ga.crossoverPopulation(population);
//
//			// Apply mutation
//			population = ga.mutatePopulation(population);
//
//			// Evaluate population
//			System.out.println("Evaluating fitness after generation " + generation);
//			ga.evalPopulation(population, numRules, mirror, null, minNumPlayers, maxNumPlayers, rulebaseStandard);
//			
//
//			// Increment the current generation
//			generation++;
//		}
//		
//		//System.out.println("Stopped after " + maxGenerations + " generations.");
//		//Route route = new Route(population.getFittest(0));
//		//System.out.println("Best distance: " + route.getDistance());
//
//    public static int maxGenerations = 5;
//    public static int populationSize = 5;
//    public static double mutationRate = 0.001;
//    public static double crossoverRate = 0.9;
//    public static int elitismCount = 10;
//    public static int tournamentSize = 5;
//    public static int numGames = 20;
//    public static boolean mirror = true;
//
//    public static void main(String[] args) {
////        Rulebase rb = new Rulebase(false);
////        // Create cities
////        int numRules = rb.getRuleset().length;
//////		City cities[] = new City[numRules];
//////		
//////		// Loop to create random cities
//////		for (int cityIndex = 0; cityIndex < numRules; cityIndex++) {
//////			// Generate x,y position
//////			int xPos = (int) (100 * Math.random());
//////			int yPos = (int) (100 * Math.random());
//////			
//////			// Add city
//////			cities[cityIndex] = new City(xPos, yPos);
//////		}
////
////        // Initial GA
////        GeneticAlgorithm ga = new GeneticAlgorithm(populationSize, mutationRate, crossoverRate, elitismCount, tournamentSize);
////
////        // Initialize population
////        Population population = ga.initPopulation(numRules);
////
////        // Evaluate population
////        ga.evalPopulation(population, numGames, mirror);
////
////        //Route startRoute = new Route(population.getFittest(0), cities);
////        //System.out.println("Start Distance: " + startRoute.getDistance());
////        // Keep track of current generation
////        int generation = 1;
////        // Start evolution loop
////        while (ga.isTerminationConditionMet(generation, maxGenerations) == false) {
////            // Print fittest individual from population
////            //Route route = new Route(population.getFittest(0), cities);
////            //System.out.println("G"+generation+" Best distance: " + route.getDistance());
////
////            // Apply crossover
////            population = ga.crossoverPopulation(population);
////
////            // Apply mutation
////            population = ga.mutatePopulation(population);
////
////            // Evaluate population
////            System.out.println("Evaluating fitness after generation " + generation);
////            ga.evalPopulation(population, numGames, mirror);
////
////            // Increment the current generation
////            generation++;
////        }
////
////        //System.out.println("Stopped after " + maxGenerations + " generations.");
////        //Route route = new Route(population.getFittest(0));
////        //System.out.println("Best distance: " + route.getDistance());
//    }
}
