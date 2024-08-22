assume cs:code
assume ds:data
data segment
list db 01h,02h,03h,04h,05h
count db 05h
res dw 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov cl,count
lea si,list
go:
mov al,[si]
mov bl,[si]
mul bl
add dx,ax
inc si
dec cl
jnz go
mov res,dx
int 03h
code ends
end start
