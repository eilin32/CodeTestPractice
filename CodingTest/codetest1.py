number = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
speling = ['zero', 'one', 'two', 'three', 'four',
           'five', 'six', 'seven', 'eight', 'nine']
inp = []
word = ""
answer = ""


def solution(s):
    global word
    global answer
    for char in s:
        inp.append(char)
    for x in inp:
        if x in number:
            print(x)


s = input()
solution(s)
