a="374291--*+-"
que=[]
for i in a:

    if(i.isdigit()):
        que.append(int(i))
    else:
        if(i=="*"):
            que.insert(0,que.pop(0)*que.pop(0))
        elif(i=="+"):
            que.insert(0,que.pop(0)+que.pop(0))
        elif(i=="-"):
            a=que.pop(0)
            b=que.pop(0)
            que.insert(0,a-b)
        elif(i=="/"):
            a=que.pop(0)
            b=que.pop(0)
            que.insert(0,a/b)
print(que[-1])
