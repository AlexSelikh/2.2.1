package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Service
public class UserServiceImp implements UserService {


   private UserDao userDao;
   public UserServiceImp(UserDao userDao){
      this.userDao=userDao;
   }



   @Transactional
   @Override
   public User getUserByCarModelAndSeries(String model, int series) {

      return userDao.getUserByCarModelAndSeries(model,series);
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   }


