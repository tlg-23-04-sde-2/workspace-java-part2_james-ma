package com.duckrace;

import java.util.List;

class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer duckRacer = new DuckRacer(1, "Jay");
        System.out.println(duckRacer);

        // call win
        duckRacer.win(Reward.DEBIT_CARD);
        duckRacer.win(Reward.PRIZES);
        System.out.println(duckRacer);

        // retrieve a read-only view of the reward list
        List<Reward> rewardList = duckRacer.getRewards();
//        rewardList.add(Reward.DEBIT_CARD);
//        rewardList.add(Reward.PRIZES);
//        System.out.println(duckRacer);

        // show just the rewards
        System.out.println(rewardList);

        // win again, see how rewardList reflects that
        duckRacer.win(Reward.PRIZES);
        System.out.println(rewardList);
    }
}