assume cs:code
assume ds:data
data segment
list db 01h,02h,03h,04h,05h
res db 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
lea si,list
mov cl,05h
go:
add al,[si]
inc si
dec cl
jnz go
mov res,al
int 03h
code ends
end start

