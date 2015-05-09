Map m = [
           'Computing'  : ['Computing': 600,'Information Systems':300],
           'Engineering': ['Civil': 200, 'Mechanical': 100],
           'Management' : ['Management': 800]
        ]
println "the no. of departments"
println m.size()
println m.keySet()// no. of departments


println "\nthe no. programs delivered by Computing dept."
println m.get('Computing')//  programs delivered by computing departments
println m['Computing'].size()


println "\nthe no. of students enrolled in civil"
println m['Engineering'].'Civil'.value// no. of students enrolled
