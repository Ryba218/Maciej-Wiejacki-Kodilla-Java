package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();


    public  Forum(){
        theUserList.add(new ForumUser(1,  "Sasha", 'M', LocalDate.of(1895, 3, 31),2000));
        theUserList.add(new ForumUser(2,  "Natasha", 'F', LocalDate.of(1960, 5, 5),300));
        theUserList.add(new ForumUser(3,  "Jojo", 'M', LocalDate.of(1999, 4, 4),8));
        theUserList.add(new ForumUser(4,  "Student", 'F', LocalDate.of(2001, 11, 4),45));
        theUserList.add(new ForumUser(5,  "Qqq", 'F', LocalDate.of(1889, 12, 31),1678));
        theUserList.add(new ForumUser(6,  "Franek", 'M', LocalDate.of(2003, 4, 1),0));
        theUserList.add(new ForumUser(7,  "Jamaica", 'F', LocalDate.of(2001, 1, 20),14));
        theUserList.add(new ForumUser(8,  "Jameater", 'M', LocalDate.of(1998, 5, 12),334));
        theUserList.add(new ForumUser(9,  "Kakronuntfus", 'M', LocalDate.of(2002, 9, 2),30));
        theUserList.add(new ForumUser(10,  "Leonardia", 'F', LocalDate.of(1885, 12, 5),0));
        theUserList.add(new ForumUser(11,  "Grubiorz", 'M', LocalDate.of(1994, 2, 28),0));
        theUserList.add(new ForumUser(12,  "Tengelini", 'M', LocalDate.of(2003, 1, 1),22));
        theUserList.add(new ForumUser(13,  "Kasia", 'F', LocalDate.of(1998, 7, 17),1));
        theUserList.add(new ForumUser(14,  "Szpukmalendra", 'F', LocalDate.of(1899, 10, 7),0));
    }

    public List<ForumUser> getTheUserList(){

        return new ArrayList<>(theUserList);
    }

}
