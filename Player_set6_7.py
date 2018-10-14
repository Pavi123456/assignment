def play_57():
	s=input('Enter string :')
	ss=input('Enter char :')
	s1=list(s)
	c=0
	for i in range(len(s1)):
		if s1[i]==ss:
			c+=1
	return c
play_57()