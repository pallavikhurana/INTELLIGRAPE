EXERCISE1
q1-
function showdate()
{
var a=new Date();

document.wite(a.toUTCString());
document.writeln(a.getDate()+"<br/>");
document.writeln(a.getMonth());
document.writeln(a.getFullYear());
}
<html>
<head>
<title>Ques1</title>
<script src="ques1.js">
</script>
</head>
<body>
<script language="javascript">

showdate();
</script>
</body>
</html>


EXERCISE2
q1-
<html>
<head>
<title>
question three
</title>
</head>
<body>
<p Id="demo"> hiii this is diksha </p>
<script language="javascript">
document.getElementById("demo").innerHTML="<p>hello!!!</p> <br> <ul><li>
garima
<li>pallavi
<li>diksha
<li>kunnu</ul>";

</script>

</body>
</html>

q2-
<html>
<head>
<title>
question three
</title>
<script src="ques3.js">
</script>
</head>
<body>
<div Id="timeDisp"> hiii this is diksha</div>
<script language="javascript">
document.getElementById("timeDisp").innerHTML=showdate();

</script>

</body>
</html>

EXERCISE-3
q1-
<html>
<head>
<title>clock object</title>
<script language="javascript">
function show()
{
var obj=new Date();
    var h=obj.getHours();
    var m=obj.getMinutes();
    var s=obj.getSeconds();
document.write(h+":"+m+":"+s);
}
</script>
</head>
<body>
<script language="javascript">
show();
</script>
</body>
</html>

EXERCISE-4
q1-
<html>
<head>
<title>intervals</title>


<script language="javascript">

function updatetime()
{
var obj=new Date();
    var h=obj.getHours();
    var m=obj.getMinutes();
    var s=obj.getSeconds();


document.write("<br><br><br>"+h+":"+m+":"+s+"<br>");
}
function start()
{
var ref=setInterval("updatetime()", 1000);
}
function stop()
{
clearInterval(ref);
}
</script>
</head>
<body>

<input type="button" name="b1" value="start displaying time!!" onClick='start()'>

<input type="button" name="b2" value="stop displaying time!!" onClick='stop()'>
</body>
</html>


FINAL EXERCISE
q1-simple interest
<html>
<body>
<p id=demo>hey</p>
<button onclick="calc()">try</button>
<script language="javascript">
function calc()
{
var p = prompt("enter the amount", "0");
si=p;
var r = prompt("enter the interest rate", "0");
si=si*r;
var t = prompt("enter the time", "0");
si=(si*t)/100;
document.getElementById("demo").innerHTML =
        "The simple interest is" + si + "!";

}
</script>
</body>
</html>

q2- palindrome
<html>
<body>
<p id="demo">hey!!</p>
<button onclick="find()">click here</button>
<script language="javascript">
function find()
{
var r = prompt("enter the string", "0");
n= r.length;
 
   end = n - 1;
   middle = n/2;
flag=0;
 
   for (begin = 0; begin < middle; begin++)
   {
      if (r[begin] != r[end])
      {
         document.getElementById("demo").innerHTML =
        "The entered string is not a palindrome!";
	flag=1;
         break;
      }
      end--;
   }
   if (flag==0)
{
     document.getElementById("demo").innerHTML = "The entered string is a palindrome!";
}
}
</script>
</body>
</html>

q3- area of circle
<html>
<body>
<p id=demo>hey</p>
<button onclick="calc()">ask for raduis</button>
<script language="javascript">
function calc()
{
var r = prompt("enter the raduis of the circle", "0");
area= 3.14*r*r;
document.getElementById("demo").innerHTML =
        "The area of the circle is" + area + "!";

}
</script>
</body>
</html>

q4-
<html>
<body>
<center>
<button onclick="ask()">click here</button>
<br>
<br>
<input type="text" name="t1" id="demo" value=" ">
</center>
<script language="javascript">
function ask()
{
var name= prompt("Enter your name!", "");
document.getElementById("demo").value = " YOU ENTERED:"+name+"!";
}
</script>
</body>
</html>
