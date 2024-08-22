assume cs:code
assume ds:data
data segment
num1 db 08h
num2 db 09h
res db ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov al,num1
mov bl,num2
mul bl
mov res,al
int 03h
code ends
end start
