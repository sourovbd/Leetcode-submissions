class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int lenOfPlayers = players.length;
        int lenOfTrainers = trainers.length;
        int count = 0, player = 0, trainer=0;
        while (player<lenOfPlayers && trainer<lenOfTrainers) {
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