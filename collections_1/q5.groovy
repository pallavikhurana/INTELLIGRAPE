List l =[90,112,43,84,35,60,7,8,9,10]
List l2 =[]
println(l)

l.eachWithIndex{p,index->
if(index%2==1)
{
l2.add(p)
}
}
println(l-l2)