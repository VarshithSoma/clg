assume cs:code
assume ds:data
data segment
num1 db 04h
num2 db 02h
res db ?
code segment
start:
mov ax,data
mov ds,ax
mov al,num1
mov bl,num2
add al,bl
mov res,al
int 03h
code ends
end start
