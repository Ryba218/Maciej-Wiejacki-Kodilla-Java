package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.SocialPublisher;
import org.junit.Assert;
import org.junit.Test;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark M");
        User john = new YGeneration("John Y");
        User jessica = new ZGeneration("Jessica Z");

        //When
        String markShares = mark.sharePost();
        System.out.println("Mark is " + markShares);
        String johnShares = john.sharePost();
        System.out.println("John is " + johnShares);
        String jessicaShares = jessica.sharePost();
        System.out.println("Jessica is " + jessicaShares);

        //Then
        Assert.assertEquals("Sharing by Facebook",markShares);
        Assert.assertEquals("Sharing by Twitter",johnShares);
        Assert.assertEquals("Sharing by Snapchat",jessicaShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jessica = new ZGeneration("Jessica Z");

        //When
        String jessicaShares = jessica.sharePost();
        System.out.println("Jessica is " + jessicaShares);
        jessica.setSocialStrategy(new TwitterPublisher());
        jessicaShares = jessica.sharePost();
        System.out.println("Jessica is " + jessicaShares);

        //Then
        Assert.assertEquals("Sharing by Twitter",jessicaShares);
    }
}
