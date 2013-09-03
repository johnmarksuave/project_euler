public class Main{

    public static void main(String[] args){

        long[][] grid = 
            {{8L,02L,22L,97L,38L,15L,00L,40L,00L,75L,04L,05L,07L,78L,52L,12L,50L,77L,91L,8L},
             {49L,49L,99L,40L,17L,81L,18L,57L,60L,87L,17L,40L,98L,43L,69L,48L,04L,56L,62L,00L},
             {81L,49L,31L,73L,55L,79L,14L,29L,93L,71L,40L,67L,53L,88L,30L,03L,49L,13L,36L,65L},
             {52L,70L,95L,23L,04L,60L,11L,42L,69L,24L,68L,56L,01L,32L,56L,71L,37L,02L,36L,91L},
             {22L,31L,16L,71L,51L,67L,63L,89L,41L,92L,36L,54L,22L,40L,40L,28L,66L,33L,13L,80L},
             {24L,47L,32L,60L,99L,03L,45L,02L,44L,75L,33L,53L,78L,36L,84L,20L,35L,17L,12L,50L},
             {32L,98L,81L,28L,64L,23L,67L,10L,26L,38L,40L,67L,59L,54L,70L,66L,18L,38L,64L,70L},
             {67L,26L,20L,68L,02L,62L,12L,20L,95L,63L,94L,39L,63L,8L,40L,91L,66L,49L,94L,21L},
             {24L,55L,58L,05L,66L,73L,99L,26L,97L,17L,78L,78L,96L,83L,14L,88L,34L,89L,63L,72L},
             {21L,36L,23L,9L,75L,00L,76L,44L,20L,45L,35L,14L,00L,61L,33L,97L,34L,31L,33L,95L},
             {78L,17L,53L,28L,22L,75L,31L,67L,15L,94L,03L,80L,04L,62L,16L,14L,9L,53L,56L,92L},
             {16L,39L,05L,42L,96L,35L,31L,47L,55L,58L,88L,24L,00L,17L,54L,24L,36L,29L,85L,57L},
             {86L,56L,00L,48L,35L,71L,89L,07L,05L,44L,44L,37L,44L,60L,21L,58L,51L,54L,17L,58L},
             {19L,80L,81L,68L,05L,94L,47L,69L,28L,73L,92L,13L,86L,52L,17L,77L,04L,89L,55L,40L},
             {04L,52L,8L,83L,97L,35L,99L,16L,07L,97L,57L,32L,16L,26L,26L,79L,33L,27L,98L,66L},
             {88L,36L,68L,87L,57L,62L,20L,72L,03L,46L,33L,67L,46L,55L,12L,32L,63L,93L,53L,69L},
             {04L,42L,16L,73L,38L,25L,39L,11L,24L,94L,72L,18L,8L,46L,29L,32L,40L,62L,76L,36L},
             {20L,69L,36L,41L,72L,30L,23L,88L,34L,62L,99L,69L,82L,67L,59L,85L,74L,04L,36L,16L},
             {20L,73L,35L,29L,78L,31L,90L,01L,74L,31L,49L,71L,48L,86L,81L,16L,23L,57L,05L,54L},
             {01L,70L,54L,71L,83L,51L,54L,69L,16L,92L,33L,48L,61L,43L,52L,01L,89L,19L,67L,48L}};


        long maxProd = 0;

        for(int i = 0; i < grid.length-3; i++){

            for(int j = 0; j < grid[i].length; j++){

                long vertProd = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];

                long horizProd = 0; 
                long lRDiagProd = 0;
                if(j < grid[i].length-3){
                    horizProd = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                    lRDiagProd = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                }

                long rLDiagProd = 0;
                if(j > 2){
                    rLDiagProd = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                }

                if(horizProd > maxProd){
                    maxProd = horizProd;
                }
                if(vertProd > maxProd){
                    maxProd = vertProd;
                }
                if(lRDiagProd > maxProd){
                    maxProd = lRDiagProd;
                }
                if(rLDiagProd > maxProd){
                    maxProd = rLDiagProd;
                }
            }
        }

        System.out.println("Max. Product: " + maxProd);

    }
}
