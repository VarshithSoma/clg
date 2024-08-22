assume cs:code
assume ds:data
data segment
num1 dw 0023h
num2 dw 0001h
num3 dw 0016h
num4 dw 0049h
res1 dw 00h
res2 dw 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,num1
mov bx,num2
mov cx,num3
mov dx,num4
add ax,cx
add bx,dx
mov res1,ax
mov res2,bx
int 03h
code ends
end start
