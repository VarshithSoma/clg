assume cs:code
assume ds:data
data segment
str1 db 'cse'
str2 db 'snist'
str3 db 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
mov cl,08h
lea si,str1
lea di,str3
go:
mov al,[si]
mov [di],al
inc si
inc di
dec cl
jnz go
int 03h
code ends
end start
