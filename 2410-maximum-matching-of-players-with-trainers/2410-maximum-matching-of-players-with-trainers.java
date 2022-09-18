class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int totalNoOfPlayers = players.length;
        int totalNoOfTrainers = trainers.length;
        int count = 0, player = 0, trainer = 0;
        while (player < totalNoOfPlayers && trainer < totalNoOfTrainers) {
            if (players[player] <= trainers[trainer]) {
                player++;
                trainer++;
                count++;
            } else {
                trainer++;
            }
        }
        return count;
    }
}