//package com.restApi.crime.db.CrimeDB.service;
//
//import com.restApi.crime.db.CrimeDB.domain.User;
//import com.restApi.crime.db.CrimeDB.repositories.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//    private final UserRepository mUserRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//        mUserRepository = userRepository;
//    }
//
//    @Override
//    public User findUserById(Long id) {
//        return mUserRepository.findById(id).get();
//    }
//
//    @Override
//    public boolean saveUserCredentials(User user) {
//        return mUserRepository.save(user) != null;
//    }
//
//    @Override
//    public User updateUserCredentials(Long id, User user) {
//        User dbUser = mUserRepository.findById(id).get();
//        String name = user.getName();
//        if(name != null) dbUser.setName(name);
//        String password = user.getPassword();
//        if(password != null ) dbUser.setPassword(password);
//        String phoneNumber = user.getPhoneNumber();
//        if(phoneNumber!= null) dbUser.setPhoneNumber(phoneNumber);
//        String emailAddress = user.getEmailAddress();
//        if(emailAddress != null) dbUser.setEmailAddress(emailAddress);
//
//        mUserRepository.deleteById(id);
//        mUserRepository.save(dbUser);
//
//        return dbUser;
//    }
//
//    @Override
//    public boolean deleteUserCredentials(Long id) {
//        mUserRepository.deleteById(id);
//        return true;
//    }
//
//    @Override
//    public List<User> getAllUserList() {
////        return mUserRepository.findAll()
//        return null;
//    }
//}
