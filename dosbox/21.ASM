assume cs:code,ds:data
data segment
list db 04h,03h,02h,01h,00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov cl,04h
go3:
lea si,list
mov dl,cl
go1:
mov al,[si]
cmp al,[si+1]
jc go2
xchg al,[si+1]
mov [si],al
go2:
inc si
dec dl
jnz go1
dec cl
jnz go3
int 03h
code ends
end start
