package com.yuanren.homework;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        //创建三名玩家
        Player player1 = new Player("张三",false);
        Player player2 = new Player("李四",false);
        Player player3 = new Player("王五",true);
        //定义一副牌数组
        String[] playingCard={"黑桃A","黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K",
                "红桃A","红桃2","红桃3","红桃4","红桃5","红桃6","红桃7","红桃8","红桃9","红桃10","红桃J","红桃Q","红桃K",
                "方块A","方块2","方块3","方块4","方块5","方块6","方块7","方块8","方块9","方块10","方块J","方块Q","方块K",
                "梅花A","梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8","梅花9","梅花10","梅花J","梅花Q","梅花K",
                "大王","小王"};
        //转换为集合
        List<String> playingCards = Arrays.asList(playingCard);
        //打乱集合顺序
        Collections.shuffle(playingCards);
        //给三人每人17张
        List<String> player1List=new ArrayList<String>();
        List<String> player2List=new ArrayList<String>();
        List<String> player3List=new ArrayList<String>();
        player1List.addAll(playingCards.subList(0, 17));
        player2List.addAll(playingCards.subList(17, 34));
        player3List.addAll(playingCards.subList(34, 51));
        player1.setList(player1List);
        player2.setList(player2List);
        player3.setList(player3List);
        //判断是否是地主
        List<String> surplusCard = playingCards.subList(51, 54);
       if(player1.isFlag()==true){
           player1List.addAll(surplusCard);
           player1.setList(player1List);
        }
        if(player2.isFlag()==true){
            player2List.addAll(surplusCard);
            player2.setList(player2List);
        }
        if(player3.isFlag()==true){
            player3List.addAll(surplusCard);
            player3.setList(player3List);
        }
        //输出牌
        System.out.println(player1.getName()+"的牌为："+player1.getList()+"\n"+
                player2.getName()+"的牌为："+player2.getList()+"\n"+
                player3.getName()+"的牌为："+player3.getList());


    }
}
