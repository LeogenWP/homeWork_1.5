package com.LeogenWP.basepatterns.structural.facade;

public class Sailor {
     void doJob(boolean onMission) {
         if(onMission) {
             System.out.println("I am a sailor in the middle of a sea, I am working hard");
         } else {
             System.out.println("I am a sailor in a port. I am resting :)");
         }
     }
}
