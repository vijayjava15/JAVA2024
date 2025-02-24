package corejavaprojects.votingmachine;

import java.util.*;

public class VotingMachine {
  
    public static void main(String[] args) {
        Set<String> votedIds = new HashSet<>();

         int count  =0 ;
        Map<String,Integer> candidateAndVoteCountMap = new HashMap<>();

        Map<Integer, String>  candidateMapping = new HashMap<>();

        System.out.println("Welcome to vote");
        System.out.println(" please select the candidate");
        showCandidateNames();
        Scanner scanner = new Scanner(System.in);
        var  vote =  scanner.nextInt();

        candidateAndVoteCountMap.put(candidateMapping.get(vote),candidateAndVoteCountMap.getOrDefault(candidateMapping.get(vote)+vote,1));
        System.out.println(candidateAndVoteCountMap);
        count ++ ; 
        if (count<30){
            String[] ggg = new String[0];
            main(ggg);
        }
        
    }






    static  void getCandidateMapping(Map<Integer, String> candidateMap){
        candidateMap.put(1, "Vijay");
        candidateMap.put(2, "Ambedkar");
        candidateMap.put(2, "Nehru");
        candidateMap.put(2, "Gandhi");
    }


   static void showCandidateNames(){
        System.out.print("Vijay"+  "   1");
        System.out.print("Ambedkar"+  "   2");
        System.out.print("Nehru"+   "   3");
        System.out.print("Gandhi"+   "    4");
    }
}
