use ql_sinh_vien ;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT *
FROM subject
WHERE Credit = (SELECT MAX(Credit) FROM subject);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT * FROM subject
WHERE SubID IN (SELECT SubID FROM mark WHERE Mark = (SELECT MAX(Mark) FROM mark));
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT Students.StudentID, Students.StudentName, AVG(mark.Mark) AS AverageMark
FROM Students
LEFT JOIN mark ON Students.StudentID = mark.StudentID
GROUP BY Students.StudentID, Students.StudentName
ORDER BY AverageMark DESC;