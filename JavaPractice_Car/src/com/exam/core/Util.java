package com.exam.core;

import java.sql.SQLOutput;
import java.util.*;

public class Util {

    private static Scanner scanner = new Scanner(System.in);


    private Util() {

    }

    //增加一个此方法 用来显示老师的所有的功能
    public static void showAll_teacher() {
        while (true) {
           try{
               System.out.println("老师功能如下: \n 1.账户注册 \n 2.账户登录 \n 3.退出");
               System.out.println("请输入功能选项:");
               String numberStr = scanner.next();
               int number = Integer.parseInt(numberStr);
               switch (number) {
                   case 1:
                       //注册  创建老师对象,并且往老师的集合中添加
                       Teacher teacher = new Teacher();
                       String name="";
                       while(true) {
                           System.out.println("请输入名字:");
                           name = scanner.next();
                           if(checkTeacherName(name)){
                               System.out.println("名字重复！");
                           }else {
                               break;
                           }
                       }
                       System.out.println("请输入密码:");
                       String password=scanner.next();
                       System.out.println("请输入联系方式:");
                       String phone=scanner.next();
                       System.out.println("请选择性别: \n 1.男 \n 0.女");
                       String sexStr = scanner.next();
                       int sex = Integer.parseInt(sexStr);
                       //在对象中添加数据
                       if(sex==1){
                           teacher.setSex(Gender.MALE);
                       }else{
                           teacher.setSex(Gender.FEMALE);
                       }
                       teacher.setIphone(phone);
                       teacher.setPassword(password);
                       teacher.setName(name);
                       System.out.println("注册成功！");
                       //往集合中添加老师对象
                       addTeacher(teacher);
                       break;
                   case 2:
                       //登录
                       System.out.println("请输入登录账户:");
                       String  tname=scanner.next();
                       System.out.println("请输入密码:");
                       String pass=scanner.next();
                       Teacher teacher1 = login_teacher(tname, pass);
                       if(teacher1!=null){
                          while(number!=11){
                              //进行下一步操作
                              System.out.println("欢迎‘"+tname+"’登录,请输入你想完成的操作: \n 1.信息修改 \n 2.个人账户注销 \n 3.查看个人信息 " +
                                      "\n 4.删除学生信息 \n 5.查看学生信息 \n 6.添加试题 \n 7.修改试题 \n 8.删除试题 \n 9.查看单个试题 " +
                                      "\n 10.根据分数查找试题 \n 11.退出");
                              numberStr = scanner.next();
                              number = Integer.parseInt(numberStr);
                              switch (number){
                                  case 1://修改当前个人信息并更新集合中的信息
                                      changeTeacher(teacher1);
                                      for (Teacher teacher2 : DatabaseUtil.getTeacherList()) {
                                          if(teacher1.getId().equals(teacher2.getId())){
                                              teacher2=teacher1;
                                          }
                                      }
                                      System.out.println("修改成功！");
                                      break;
                                  case 2://删除集合中的个人账户  直接返回登陆注册界面
                                      deleteTeacher(teacher1);
                                      System.out.println("删除个人信息成功！");
                                      break;
                                  case 3://查看教师个人信息
                                      lookTeacher(teacher1);
                                      break;
                                  case 4://删除学生信息
                                      String ID ="";
                                      while(true) {
                                          System.out.println("请输入删除学生的ID：");
                                          ID = scanner.next();
                                          Student student = checkStudent(ID);
                                          if(student!=null){
                                              break;
                                          }else {
                                              System.out.println("输入的学生ID不存在，请重新输入。");
                                          }
                                      }
                                      delctStudent(ID);
                                      System.out.println("删除学生信息成功！");
                                      break;
                                  case 5:
                                      ID ="";
                                      while(true) {
                                          System.out.println("请输入要查看学生信息的ID：");
                                          ID = scanner.next();
                                          Student student = checkStudent(ID);
                                          if(student!=null){
                                              break;
                                          }else {
                                              System.out.println("输入的学生ID不存在，请重新输入。");
                                          }
                                      }
                                      lookStudent(ID);
                                      break;
                                  case 6://添加试题
                                      Exam exam = new Exam();
                                      System.out.println("请输入试题题目：");
                                      String title=scanner.next();
                                      System.out.println("请输入试题答案A：");
                                      String anwserA=scanner.next();
                                      System.out.println("请输入试题答案B：");
                                      String anwserB=scanner.next();
                                      System.out.println("请输入试题答案C：");
                                      String anwserC=scanner.next();
                                      System.out.println("请输入试题答案D：");
                                      String anwserD=scanner.next();
                                      System.out.println("请输入试题正确答案：");
                                      String anwser=scanner.next();
                                      System.out.println("请输入试题分数：");
                                      String score = scanner.next();
                                      int scores = Integer.parseInt(score);
                                      exam.setTitle(title);
                                      exam.setAnwserA(anwserA);
                                      exam.setAnwserB(anwserB);
                                      exam.setAnwserC(anwserC);
                                      exam.setAnwserD(anwserD);
                                      exam.setAnwser(anwser);
                                      exam.setScore(scores);
                                      addExam(exam);
                                      System.out.println("添加试题成功！");
                                      break;
                                  case 7://修改试题
                                      Exam exam1 =null;
                                      String eId=null;
                                      while(true) {
                                          System.out.println("输入要修改试题的ID：");
                                          eId = scanner.next();
                                          exam1 = checkExamID(eId);
                                          if (exam1 != null) {
                                              break;
                                          } else {
                                              System.out.println("输入的试题ID不存在！");
                                          }
                                      }
                                      changeExam(exam1,eId);
                                      System.out.println("试题修改成功！");
                                      break;
                                  case 8://删除试题
                                      exam1 =null;
                                      eId=null;
                                      while(true) {
                                          System.out.println("输入要删除试题的ID：");
                                          eId = scanner.next();
                                          exam1 = checkExamID(eId);
                                          if (exam1 != null) {
                                              break;
                                          } else {
                                              System.out.println("输入的试题ID不存在！");
                                          }
                                      }
                                      delctExam(exam1);
                                      System.out.println("试题删除成功！");
                                      break;
                                  case 9://查看单个试题
                                      exam1 =null;
                                      eId=null;
                                      while(true) {
                                          System.out.println("输入要查看试题的ID：");
                                          eId = scanner.next();
                                          exam1 = checkExamID(eId);
                                          if (exam1 != null) {
                                              break;
                                          } else {
                                              System.out.println("输入的试题ID不存在！");
                                          }
                                      }
                                      lookExam(exam1);
                                      break;
                                  case 10://根据分数查找试题
                                      while(true) {
                                          System.out.println("输入要查看试题的分数条件：");
                                          String score1 = scanner.next();
                                          Integer score2=Integer.valueOf(score1);
                                          List<Exam> exams = checkExamSore(score2);
                                          if(exams!=null){
                                              System.out.println(exams);
                                              break;
                                          }else {
                                              System.out.println("输入的分数不合法");
                                          }
                                      }
                                      break;
                                  case 11://退出
                                      break;
                                  default:
                                      System.out.println("请按照提示输入：");;
                              }
                              if(number==3){
                                  break;
                              }

                          }

                       }else {
                           System.out.println("输入的用户名或密码错误，返回登录注册页面。");
                       }
                       break;
                   case 3:
                       return;
                   default:
                       System.out.println("请按提示输入！");
               }
           }catch (NumberFormatException e){
               System.out.println("类型不匹配，请重新输入:");
           }
        }


    }

    /**
     * 根据分数条件返回一个集合
     * @param score
     */
    private static List<Exam> checkExamSore(Integer score) {
        List<Exam> examList = DatabaseUtil.getExamList();
        List<Exam> scoreList=new ArrayList<Exam>();
        for (Exam exam : examList) {
            if(exam.getScore().equals(score)){
                scoreList.add(exam);
            }
        }
        if(scoreList.isEmpty()){
            return null;
        }
        return scoreList;
    }

    /**
     * 查看试题
     * @param exam
     */
    private static void lookExam(Exam exam) {
        for (Exam exam1 : DatabaseUtil.getExamList()) {
            if(exam.equals(exam1)){
                System.out.println(exam1);
                break;
            }
        }
    }

    /**
     * 删除试题
     * @param exam
     */

    private static void delctExam(Exam exam) {
        List<Exam> examList = DatabaseUtil.getExamList();
        for (int i = 0; i < examList.size(); i++) {
            if(exam.equals(examList.get(i))){
                examList.remove(i);
            }
        }
    }

    /**
     * 修改试题信息
     * @param exam,id
     */
    private static void changeExam(Exam exam,String id) {
        System.out.println("请输入试题题目：");
        String title=scanner.next();
        System.out.println("请输入试题答案A：");
        String anwserA=scanner.next();
        System.out.println("请输入试题答案B：");
        String anwserB=scanner.next();
        System.out.println("请输入试题答案C：");
        String anwserC=scanner.next();
        System.out.println("请输入试题答案D：");
        String anwserD=scanner.next();
        System.out.println("请输入试题正确答案：");
        String anwser=scanner.next();
        System.out.println("请输入试题分数：");
        String score = scanner.next();
        int scores = Integer.parseInt(score);
        exam.setTitle(title);
        exam.setAnwserA(anwserA);
        exam.setAnwserB(anwserB);
        exam.setAnwserC(anwserC);
        exam.setAnwserD(anwserD);
        exam.setAnwser(anwser);
        exam.setScore(scores);
        for (Exam exam1 : DatabaseUtil.getExamList()) {
            if(id.equals(exam1.geteId())){
                exam1=exam;
                break;
            }
        }
    }

    /**
     * 判断试题id是否存在
     * @param eId
     */
    private static Exam checkExamID(String eId) {
        for (Exam exam : DatabaseUtil.getExamList()) {
            if(eId.equals(exam.geteId())){
                return exam;
            }
        }
        return null;
    }

    /**
     * 根据学生id查看学生信息
     */
    private static void lookStudent(String id) {
        for (Student student : DatabaseUtil.getStudentList()) {
            if(id.equals(student.getsId())){
                System.out.println(student);
                break;
            }
        }
    }

    /**
     * 检查学生id是否存在
     */
    private static Student checkStudent(String id) {
        for (Student student : DatabaseUtil.getStudentList()) {
            if(id.equals(student.getsId())){
                return student;
            }
        }
        return null;
    }

    /**
     * 根据id删除学生信息
     * @param id
     */
    private static void delctStudent(String id) {
        List<Student> studentList = DatabaseUtil.getStudentList();
        for (int i = 0; i < studentList.size(); i++) {
            if(id.equals(studentList.get(i).getsId())){
                studentList.remove(i);
                break;
            }
        }

    }

    /**
     * 查看教师信息
     * @param teacher
     */
    private static void lookTeacher(Teacher teacher) {
        List<Teacher> teacherList = DatabaseUtil.getTeacherList();
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacher.equals(teacherList.get(i))){
                System.out.println(teacherList.get(i));
                break;
            }
        }
    }

    /**
     * 删除教师信息
     * @param teacher
     */
    private static void deleteTeacher(Teacher teacher) {
        List<Teacher> teacherList = DatabaseUtil.getTeacherList();
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacher.equals(teacherList.get(i))){
                teacherList.remove(i);
                break;
            }
        }
    }
    /**
     * 检查教师名字是否重复
     */
    private static boolean checkTeacherName(String name) {
        for (Teacher teacher : DatabaseUtil.getTeacherList()) {
            if(name.equals(teacher.getName())){
                return true;
            }
        }
        return false;
    }


    /**
     * 检查学生名字是否重复
     */
    private static boolean checkStudentName(String name) {
        for (Student student : DatabaseUtil.getStudentList()) {
            if(name.equals(student.getStuName())){
                return true;
            }
        }
        return false;
    }

    /**
     * 修改教师信息
     * @param teacher
     */
    private static void changeTeacher(Teacher teacher) {
        String name ="";
        while(true) {
        System.out.println("请输入名字:");
        name = scanner.next();
        if(checkTeacherName(name)){
            System.out.println("名字重复！");
        }else {
            break;
        }
    }
        System.out.println("请输入密码:");
        String password = scanner.next();
        System.out.println("请输入联系方式:");
        String phone = scanner.next();
        System.out.println("请选择性别: \n 1.男 \n 0.女");
        String sexStr = scanner.next();
        int sex = Integer.parseInt(sexStr);
        //在对象中添加数据
        if (sex == 1) {
            teacher.setSex(Gender.MALE);
        } else {
            teacher.setSex(Gender.FEMALE);
        }
        teacher.setIphone(phone);
        teacher.setPassword(password);
        teacher.setName(name);
    }

    /**
     * 添加试题
     * @param exam
     */
    private static void addExam(Exam exam) {
        DatabaseUtil.getExamList().add(exam);
    }

    /**
     * 添加教师集合
     * @param teacher
     */
    private static void addTeacher(Teacher teacher) {
        //往集合中添加
        DatabaseUtil.getTeacherList().add(teacher);

    }

    /**
     * 根据登录名称和密码返回Teacher对象
     * @param name
     * @param password
     * @return
     */
    private static Teacher login_teacher(String name,String password){
        List<Teacher> teacherList = DatabaseUtil.getTeacherList();
        for (Teacher teacher : teacherList) {
            if(name.equals(teacher.getName())&& password.equals(teacher.getPassword())){
                return  teacher;
            }
        }
        return null;
    }

    /**
     * 展示学生功能
     */
    public static void showAll_student() {
        int i =0;
       while(i!=3){
           try{
               System.out.println("1.注册\n2.登录\n3.退出");
               System.out.println("请输入要完成的功能");
               String i1=scanner.next();
               i = Integer.parseInt(i1);
               switch (i){
                   case 1:
                       //注册  创建学生对象,并且往学生的集合中添加
                       Student student = new Student();
                       String name="";
                       while(true) {
                           System.out.println("请输入名字:");
                           name = scanner.next();
                           if(checkStudentName(name)){
                               System.out.println("名字重复！");
                           }else {
                               break;
                           }
                       }
                       System.out.println("请输入密码:");
                       String password=scanner.next();
                       System.out.println("请输入联系方式:");
                       String phone=scanner.next();
                       System.out.println("请选择性别: \n 1.男 \n 0.女");
                       String sexStr = scanner.next();
                       int sex = Integer.parseInt(sexStr);
                       //在对象中添加数据
                       if(sex==1){
                           student.setGender(Gender.MALE);
                       }else{
                           student.setGender(Gender.FEMALE);
                       }
                       student.setPhone(phone);
                       student.setPassword(password);
                       student.setStuName(name);
                       System.out.println("注册成功！");
                       //往集合中添加老师对象
                       addStudent(student);
                       break;
                   case 2:
                       System.out.println("请输入学生登录姓名:");
                       String stname = scanner.next();
                       System.out.println("请输入学生登录密码:");
                       String pass = scanner.next();
                       Student student2=  login_student(stname,pass);
                       if(student2!=null){
                           int operation1=0;
                           while(operation1!=4) {
                               System.out.println("欢迎‘" + stname + "’登录,请输入你想完成的操作: \n 1.个人信息修改 \n 2.进行考试 \n 3.查看考试分数 " +
                                       "\n 4.退出");
                               String operation = scanner.next();
                               operation1 = Integer.parseInt(operation);
                               switch (operation1) {
                                   case 1:
                                       //个人信息修改
                                       changeStudent(student2);
                                       //更新到集合中
                                       for (Student student1 : DatabaseUtil.getStudentList()) {
                                           if(student2.getsId().equals(student1.getsId())){
                                               student1=student2;
                                           }
                                       }
                                       System.out.println("修改成功！");
                                       break;
                                   case 2:
                                       //调用显示试题的方法
                                       showExam(student2);
                                       break;
                                   case 3:
                                       while(true) {
                                           System.out.println("请输入查看第几次成绩单：");
                                           String times = scanner.next();
                                           TotalPoints totalPoints = lookTotalPoints(student2, times);
                                           if(totalPoints!=null){
                                               System.out.println(totalPoints);
                                               break;
                                           }
                                           System.out.println("您输入的次数不正确。");
                                       }
                                       break;
                                   case 4:
                                       break;
                                   default:
                                       System.out.println("请按提示输入。");
                                       break;
                               }
                           }
                       }else {
                           System.out.println("输入的用户名或密码错误，返回登录注册页面。");
                       }
                       break;
                   case 3:
                       break;
                   default:
                       System.out.println("请按照提示输入语句");
                       break;
               }
           }catch (NumberFormatException e){
               System.out.println("类型不匹配，请重新输入:");
           }
       }


    }

    /**
     * 查看学生第几次成绩
     * @param student,times
     */
    private static TotalPoints lookTotalPoints(Student student,String times) {
        List<TotalPoints> totalPointsList = student.getTotalPointsList();
        for (TotalPoints totalPoints : totalPointsList) {
            if(times.equals(totalPoints.getTPId())){
                return totalPoints;
            }
        }
       return null;
    }

    /**
     * 修改学生信息
     * @param student
     */
    private static void changeStudent(Student student) {
        String name="";
        while(true) {
            System.out.println("请输入名字:");
            name = scanner.next();
            if(checkStudentName(name)){
                System.out.println("名字重复！");
            }else {
                break;
            }
        }
        System.out.println("请输入密码:");
        String password=scanner.next();
        System.out.println("请输入联系方式:");
        String phone=scanner.next();
        System.out.println("请选择性别: \n 1.男 \n 0.女");
        String sexStr = scanner.next();
        int sex = Integer.parseInt(sexStr);
        //在对象中添加数据
        if(sex==1){
            student.setGender(Gender.MALE);
        }else{
            student.setGender(Gender.FEMALE);
        }
        student.setPhone(phone);
        student.setPassword(password);
        student.setStuName(name);
    }

    /**
     * 往学生集合中添加数据
     * @param student
     */
    private static void addStudent(Student student) {
        //往集合中添加
        DatabaseUtil.getStudentList().add(student);
    }

    /**
     * 显示试题的方法
     * @param student
     */
    private static void showExam(Student  student) {
        int  score=0;
        List<Exam> examList = DatabaseUtil.getExamList();
        //获取10个试题
        Collections.shuffle(examList);
        for (int i = 0; i < 10; i++) {
            System.out.println(examList.get(i));
            System.out.println("请输入试题答案:");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase(examList.get(i).getAnwser())){
                    //如果一抹一样就统计分数
                score+=examList.get(i).getScore();
            }
        }
        //考试完成之后把成绩塞给学生
        TotalPoints totalPoints=new TotalPoints();
        totalPoints.setScore(score);
        totalPoints.setDate(new Date());
        addTotallPoints(student,totalPoints);
    }

    /**
     * 学生登录
     * @param name
     * @param password
     * @return
     */
    private static Student login_student(String name,String password) {
        List<Student> studentList = DatabaseUtil.getStudentList();
        for (Student student : studentList) {
            if(student.getStuName().equals(name) &&
                student.getPassword().equals(password)){
                System.out.println(name+"登录成功");
                return student;
            }
        }
        return null;
    }

    /**
     * 学生成绩集合里面添加成绩对象
     */
    private static void addTotallPoints(Student student,TotalPoints totalPoints){
        List<TotalPoints> totalPointsList = student.getTotalPointsList();
        totalPoints.setTPId(totalPointsList.size()+1+"");
        totalPointsList.add(totalPoints);
    }

}
