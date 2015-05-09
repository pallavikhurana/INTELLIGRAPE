List l1=(1..100)

l1.each({
    if(it%3==0)
    print" "+"fizz"
    else if(it%5==0)
    print" "+"buzz"
    else if(it%15==0)
     print" "+"fizzbuzz"    
    else
     print" "+it
})