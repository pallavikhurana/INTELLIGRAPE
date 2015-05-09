class Employee
{
  String Name;
  byte age;
  String dept;
  int e_no;
  int salary;
}
Employee e1=new Employee(name:'GARIMA',age:23 as byte,dept:'Finance',e_no:101,salary:20000)
Employee e2=new Employee(name:'kunal',age:53 as byte,dept:'Marketing',e_no:102,salary:2000)
Employee e3=new Employee(name:'pallo',age:83 as byte,dept:'Manufacturing',e_no:103,salary:3000)
Employee e4=new Employee(name:'Simran',age:13 as byte,dept:'Marketing',e_no:104,salary:4000)
Employee e5=new Employee(name:'Mohit',age:53 as byte,dept:'Manufacturing',e_no:105,salary:6000)
List l=[e1,e2,e3,e4,e5]
println "Sol1"
Map m1=l.groupBy({
     if((it.salary>=0) && (it.salary<=5000))
     return "Within 5000";
     else if((it.salary>5000) && (it.salary<=10000)) 
     return "Within 10000";
     else
     return "above 10000"
})
println m1*.value.name;

println "Sol2"
Map m2=l.groupBy({it.dept})
m2.each({
  print "\t"+it.key+" "+it.value.size();
})
print "\n"

println "Sol3"
l.each({
if(it.age>18 && it.age<35)
println "Employees with age between 18 and 35:"+it.name
})

println "Sol4"
Map m=l.groupBy{it.name[0]};
println m*.value.name
m.each{
print "Name Start with:${it.key} and number of Employees with Age >20 are:"
println it.value.countBy({it2->it2.age>20}).get(true)
}

println "Sol5"
Map m5=l.groupBy({it.dept})
println m5