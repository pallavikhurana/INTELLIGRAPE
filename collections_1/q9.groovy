
String s = "this string needs to be split"
println s.tokenize("")// this will print with blank space in b/w wrds
println s.tokenize()// this will separate each wrd with ,

println s.split("")// this will separate each letter with ,
println s.split(/\s/)//this will separate each wrd with , same as tokenize()

println s.tokenize(/\s/)//this will skip letter s from every word


String s1="are.you.trying.to.split.me"

s1.tokenize(".")// this gives you the empty string
s1.split(".")// this will split the string as delimeter provided and results an empty string