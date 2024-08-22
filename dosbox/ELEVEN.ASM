assume cs:code
assume ds:data
num1 db 004h
res dw ?
data ends
code segment
start:
mov ax,data
mov ds,ax
mov al,num1
mov bl,num1
mul bl
mov res,ax
int 03h
code ends
end start
