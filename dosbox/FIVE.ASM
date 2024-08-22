assume cs:code
assume ds:data
data segment
num1 dw 6271h
num2 dw 3431h
res dw ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
mov ax,num1
mov bx,num2
add ax,bx
mov res,ax
int 03h
code ends
end start
