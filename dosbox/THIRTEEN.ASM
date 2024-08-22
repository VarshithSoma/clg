assume cs:code
assume ds:data
data segment
num1 db 04h
res dw 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,01h
mov bl,num1
go:
mul bl
dec bl
jnz go
mov res,ax
int 03h
code ends
end start
