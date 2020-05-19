//package com.restApi.crime.db.CrimeDB.bootstrap;
//
//import com.restApi.crime.db.CrimeDB.domain.TheftCase;
//import com.restApi.crime.db.CrimeDB.domain.User;
//import com.restApi.crime.db.CrimeDB.repositories.TheftCaseRepository;
//import com.restApi.crime.db.CrimeDB.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import java.util.Date;
//
//@Component
//public class BootStrapData implements CommandLineRunner {
//
//    private UserRepository mUserRepository;
//    private TheftCaseRepository mTheftCaseRepository;
//
//    public BootStrapData(UserRepository userRepository , TheftCaseRepository theftCaseRepository) {
//        mUserRepository = userRepository;
//        mTheftCaseRepository = theftCaseRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Date date = new Date();
//        User user1 = new User("FirstUser","FirstUser@gmail.com","myPassword1",
//                "1234567890", (byte) 1, date.toString());
//        User user2 = new User("SecondUser","SecondUser@gmail.com","myPassword2",
//                "1234567823", (byte) 1,date.toString());
//        User user3 = new User("ThirdUser","ThirdUser@gmail.com","myPassword3",
//                "1234567845", (byte) 2,date.toString());
//        mUserRepository.save(user1);
//        mUserRepository.save(user2);
//        mUserRepository.save(user3);
//        System.out.println( 3 +" User"+" added ");
//
//        TheftCase theftCase = new TheftCase("Subject of the case1" , "Description of " +
//                "case1");
//        TheftCase theftCase1 = new TheftCase("Subject of the case2" , "Description of " +
//                "case2");
//        TheftCase theftCase2 = new TheftCase("Subject of the case3" , "Description of " +
//                "case3");
//        mTheftCaseRepository.save(theftCase);
//        mTheftCaseRepository.save(theftCase1);
//        mTheftCaseRepository.save(theftCase2);
//        System.out.println(3+"Theft Case"+"added");
//
//    }
//}
