assume cs:code
assume ds:data
data segment
num1 db 05h
num2 db 02h
quo db ?
rem db ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
mov al,num1
mov bl,num2
div bl
mov quo,al
mov rem,ah
int 03h
code ends
end start
