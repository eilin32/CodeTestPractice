def solution(participant, completion):
    countP={}
    for i in participant:
        try: countP[i]+=1
        except: countP[i]=1
    for x in completion:
        countP[x]-=1
    for v,k in countP.items():
        if k >0:
            answer = v

    return answer
