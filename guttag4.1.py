
def printstr(s1, s2, reverse):
	if reverse:
		print ("String is %s  %s" %s2 %s1)
	else:
		print ("String is %s  %s" %s1 %s2)

def strinstr(s1, s2):
	if ((s1.find(s2)>-1) or (s2.find(s1)>-1)):
		print "True" 
	else:
		print s1, " ", s2


strinstr("world", "helloworld")

printstr("hello", "sushma", False)


