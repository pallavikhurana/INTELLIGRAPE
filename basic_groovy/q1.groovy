class Person{
String name
Integer age
String gender
String address

public void setName(String n){
    this.name=n
}

public void setAge(Integer a){
    this.age=a
}

public String getGender(){
    return gender
}
public String getAddress(){
    return address
}

}

Person person=new Person()
person.setName("garima")
person.setAge(23)
person.gender="female"
person.address="xyz delhi"

println(person.name)
println(person.age)
println(person.getGender())
println(person.getAddress())