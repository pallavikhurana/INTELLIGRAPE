class Emp 
{
    String Name;
    int age;
    int salary;
}
Emp e1= new Emp(name:'garima',age:22 , salary:10000)
Emp e2= new Emp(name:'ruhi', age:20 , salary:1000)
Emp e3= new Emp(name:'mohi', age:26 , salary:2000)
Emp e4= new Emp(name:'sohi', age:29 , salary:10000)
Emp e5= new Emp(name:'bhfhfg', age:32 , salary:9000)
Emp e6= new Emp(name:'jffh', age:21 , salary:25000) 

List l=[e1,e2,e3,e4,e5,e6]

List l2= l.findAll({Emp e-> 
    e.salary<5000
})

l2.each
{
    println it.name+" "+it.salary
}

println "young employee among all\t"+l.min({it.age}).name
println "older employee among all\t"+l.max({it.age}).name
println "employee with highest salary=\t"+l.max({it.salary}).name

List l1= l.findAll
{
it.name
}
print l1*.name
