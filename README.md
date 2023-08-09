# NavigationDemo
1.	Navigation Graph (Đồ thị điều hướng):
•	Là một đại diện trực quan cho toàn bộ cấu trúc điều hướng trong ứng dụng.
•	Bao gồm các mục tiêu điều hướng (Destinations) và các hành động điều hướng (Actions) giữa chúng.
•	Được định nghĩa trong tệp nav_graph.xml.

2.	Navigation Destinations (Mục tiêu điều hướng):
•	Đại diện cho các màn hình hoặc destinations trong ứng dụng.
•	Được định nghĩa bởi các fragment, activity hoặc các nút điều hướng (navigation node).
•	Mỗi mục tiêu có một ID duy nhất và có thể chứa các đối số (arguments).

3.	 (Hành động điều hướng):
•	Đại diện cho sự chuyển từ một mục tiêu điều hướng (destination) sang mục tiêu khác.
•	Được định nghĩa trong Navigation Graph.
•	Có thể được sử dụng để truyền dữ liệu giữa các mục tiêu.

4.	Navigation Host (Chủ điều hướng):
•	Là nơi chứa các mục tiêu điều hướng trong ứng dụng, thường là một Fragment hoặc Activity.
•	Có khả năng làm điểm khởi đầu cho việc điều hướng trong ứng dụng.

5.	Navigation Controller
•	Được sử dụng để điều hướng giữa các mục tiêu điều hướng (destinations) trong Navigation Graph.
•	Để thực hiện việc chuyển từ một Fragment sang Fragment khác hoặc từ một Fragment đến một Activity
