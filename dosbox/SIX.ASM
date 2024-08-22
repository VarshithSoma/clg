assume cs:code
assume ds:data
data segment
num1 dw 1234h
num2 dw 04h
res dw ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
mov ax,num1
mov bx,num2
sub ax,bx
mov res,ax
int 03h
code ends
end start
