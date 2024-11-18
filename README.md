## 2024 11月实训后端

### 接口设置
port `8070`


##### Users
`insert_user` 新增一个 User

参数: 一个 User

`delete_user_by_ID` 删除 User

参数: 一个 int 值, 名字为 `ID`

`delete_user_by_IDS` 删除一个数组的 User

参数: 一个 int 数组, 名字随意

`update_user` 修改 User

参数: 一个 User

`select_all_users` 返回所有的 User

参数: 无

`select_user_by_ID` 返回指定 ID 的 User

参数: 一个 int 值, 名字为 `ID`

`select_user_by_Name` 返回指定 Name 的 User

参数: 一个 String 值, 名字为 `Name`

`select_user_by_Name_and_Password` 返回指定 Name 和 Password 的 User

参数: 两个 String 值, 名字分别为 `Name` `Password`

##### Tenants
`select_all_tenants` 返回所有的 Tenant


##### Projects
`select_all_projects` 返回所有的 Project


##### Projects
`select_all_project_users` 返回所有的 ProjectUser
