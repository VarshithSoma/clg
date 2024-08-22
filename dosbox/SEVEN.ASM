assume cs:code
assume ds:data
data segment
num1 dw 02h
num2 dw 1234h
res dw ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,num1
mov bx,num2
mul bx
mov res,ax
int 03h
code ends
end start
