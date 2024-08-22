assume cs:code
assume ds:data
data segment
num1 dw 1000h
num2 dw 300h
quo dw ?
rem dw ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,num1
mov bx,num2
div bx
mov quo,ax
mov rem,dx
int 03h
code ends
end start
