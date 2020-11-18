﻿create database PRO1_E1
GO 
USE PRO1_E1
GO
CREATE TABLE PHONG
(
	IDPHONG INT IDENTITY(1,1),
	TENPHONG NVARCHAR(50) NOT NULL,
	IDTRP INT ,
	NGANSACH FLOAT,
	CONSTRAINT PK_PHONG PRIMARY KEY (IDPHONG)
)
GO
CREATE TABLE BAN --PAN
(
	IDBAN INT IDENTITY(1,1),
	IDPHONG INT NOT NULL,
	TENBAN NVARCHAR(50) NOT NULL,
	CONSTRAINT PK_BAN PRIMARY KEY (IDBAN),
	CONSTRAINT DK_BAN_PHONG FOREIGN KEY (IDPHONG) REFERENCES PHONG(IDPHONG)
)
CREATE TABLE NHANVIEN 
(
	IDNV INT IDENTITY(1,1),
	TENNV NVARCHAR(30) NOT NULL, -- HỌ VÀ TÊN NHÂN VIÊN
	IDBAN INT NOT NULL,
	EMAIL NVARCHAR(30) NOT NULL,
	SDT NVARCHAR(15) NOT NULL,
	CMT NVARCHAR(15) NOT NULL, -- SỐ CHỨNG MINH NHÂN DÂN CỦA NHÂN VIÊN
	TKNH NVARCHAR(15) ,
	HINH NVARCHAR(30),
	QUYEN INT NOT NULL,
	CONSTRAINT PK_NHANVIEN PRIMARY KEY (IDNV),
	CONSTRAINT FK_NAHNVIEN_BAN FOREIGN KEY (IDBAN) REFERENCES BAN(IDBAN)
)
CREATE TABLE HAUCAN
(
	IDHAUCAN INT IDENTITY(1,1),
	TENBP NVARCHAR(30) NOT NULL,
	TENNGUOILH NVARCHAR(30) NOT NULL,
	EMAIL NVARCHAR(30),
	DTHOAI NVARCHAR(15),
	CONSTRAINT PK_HAUCAN PRIMARY KEY (IDHAUCAN)
)
CREATE TABLE SUKIEN
(
	IDSK INT IDENTITY(1,1),
	TENSK NVARCHAR(30) NOT  NULL,
	IDPHONG INT NOT NULL, -- TỰ LẤY
	NOIDUNG NVARCHAR(255) NOT NULL ,
	MUCTIEU NVARCHAR(255) NOT NULL,
	CONSTRAINT PK_SUKIEN PRIMARY KEY (IDSK),
	CONSTRAINT FK_SUKIEN_PHONG FOREIGN KEY (IDPHONG) REFERENCES PHONG(IDPHONG)
)
CREATE TABLE GIADOAN -- giaI đoạn
(
	IDGIAODOAN INT IDENTITY(1,1),
	IDSK INT NOT NULL,
	TENGD NVARCHAR(30) NOT NULL,
	DEADLINE DATE ,
	MUCTIEU NVARCHAR(255),
	CONSTRAINT PK_GIADOAN PRIMARY KEY (IDGIAODOAN),
	CONSTRAINT FK_GIAIDOAN FOREIGN KEY (IDSK) REFERENCES SUKIEN(IDSK)
)
CREATE TABLE NHIEMVU 
(
	IDNVU INT IDENTITY (1,1),
	IDGIAIDOAN INT NOT NULL,
	TENNVU NVARCHAR(30) NOT NULL,
	MOTA NVARCHAR(30),
	TRANGTHAI NVARCHAR(30), -- STATE CỦA NHIỆM VỤ
	FILEIN NVARCHAR(30), -- ĐÍNH FILE VÀO
	DEADLINE DATE,
	TGHT DATE, -- THỜI GIAN HOÀN THÀNH 
	CONSTRAINT PK_NHIEMVU PRIMARY KEY (IDNVU),
	CONSTRAINT FK_NHIEMVU_DUAN FOREIGN KEY (IDGIAIDOAN) REFERENCES GIADOAN(IDGIAODOAN) -- GIAI ĐOẠN VÀ ID GIAI ĐOẠN
	
)
CREATE TABLE COMMENT -- BÌNH LUẬN CỦA CÁC THÀNH VIÊN
(
	IDCMT INT IDENTITY(1,1),
	IDNVU INT NOT NULL,
	TENNV NVARCHAR(30) NOT NULL,
	NOIDUNG NVARCHAR(150) NOT NULL ,
	THOIGIAN DATETIME NOT NULL, -- THỜI GIAN LÚC XẢY RA CMT
	CONSTRAINT PK_COMMENT PRIMARY KEY (IDCMT),
	CONSTRAINT FK_COMMETN_NHIEMVU FOREIGN KEY (IDNVU) REFERENCES NHIEMVU(IDNVU)
)
GO
CREATE TABLE CHECHLIST
(
	IDCLIST INT IDENTITY(1,1),
	IDNVU INT NOT NULL,
	NOIDUNGCL NVARCHAR(30) NOT NULL,
	TRANGTHAI BIT NOT NULL,
	CONSTRAINT PK_CHECKLIST PRIMARY KEY (IDCLIST),
	CONSTRAINT FK_CHECKLIST_NHIEMVU FOREIGN KEY (IDNVU) REFERENCES NHIEMVU(IDNVU)
)
CREATE TABLE CHITIEU
(
	IDCTIEU INT IDENTITY(1,1),
	IDNVU INT NOT NULL,
	SOTIEN FLOAT,
	MOTA NVARCHAR(150),
	IDNVIEN int,
	CONSTRAINT PK_CHITIEU PRIMARY KEY (IDCTIEU),
	CONSTRAINT FK_CHITIEU_NHIEMVU FOREIGN KEY (IDNVU) REFERENCES NHIEMVU(IDNVU),
	CONSTRAINT FK_CHITIEU_NHANVIEN FOREIGN KEY (IDNVIEN) REFERENCES NHANVIEN(IDNV)
)
CREATE TABLE PHANCONG
(	IDNVIEN INT NOT NULL,
	IDNVU INT NOT NULL,
	CONSTRAINT PK_PHANCONG PRIMARY KEY (IDNVIEN, IDNVU),
	CONSTRAINT FK_PHANCONG_NHIEMVU FOREIGN KEY(IDNVU) REFERENCES NHIEMVU(IDNVU),
	CONSTRAINT FK_PHANCONG_NHANVIEN FOREIGN KEY (IDNVIEN) REFERENCES NHANVIEN(IDNV)
)
CREATE TABLE MUCTIEUSK
(
	IDMT INT IDENTITY(1,1),
	IDSK INT NOT NULL,
	MUCTIEU NVARCHAR(150) NOT NULL,
	TRANGTHAI BIT ,
	CONSTRAINT PK_MUCTIEUSK PRIMARY KEY (IDMT),
	CONSTRAINT FK_MUCTIEUSK_SUKIEN FOREIGN KEY (IDSK) REFERENCES SUKIEN(IDSK)

)
CREATE TABLE KHACMOI
(
	IDKM INT IDENTITY (1,1),
	IDSK INT NOT NULL,
	TENKM NVARCHAR(150) NOT NULL,
	EMAIL NVARCHAR(30) ,
	SDT NVARCHAR(15),
	GHICHU NVARCHAR(150),
	CONSTRAINT PK_KHACHMOI PRIMARY KEY (IDKM),
	CONSTRAINT DK_KHACMOI_SUKIEN FOREIGN KEY (IDSK) REFERENCES SUKIEN(IDSK)
)