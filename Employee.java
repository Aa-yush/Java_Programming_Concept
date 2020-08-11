//Program to created a Serializable class
import java.io.*;
public class Employee implements Serializable
{
 private int id;
 private String name, job;
 private int salary;
 public Employee(int id, String name, String job, int salary)
 {
  this.id = id;
  this.name = name;
  this.job = job;
  this.salary = salary;
 }
 public void showRecords()
 {
  System.out.println(id+"\t"+name+"\t"+job+"\t"+salary);
 } 
}