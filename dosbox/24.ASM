assume cs:code,ds:data
data segment
str1 db 'ece'
data ends
extra segment
str2 db 00h
extra ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,extra
mov es,ax

lea si,str1
lea di,str2

mov cl,03h
cld
rep movsb
int 03h
code ends
end start
