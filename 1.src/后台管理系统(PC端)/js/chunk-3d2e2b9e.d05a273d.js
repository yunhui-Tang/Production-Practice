(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-3d2e2b9e","chunk-9a58e340","chunk-2d217e2b"],{"04a9":function(e,t,a){},"13c7":function(e,t,a){"use strict";var r=a("6aad"),n=a.n(r);n.a},"15dc":function(e,t,a){"use strict";a.r(t);var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-card",{attrs:{bordered:!1}},[a("div",{staticClass:"table-page-search-wrapper"},[a("a-form",{attrs:{layout:"inline"},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.searchQuery(t)}}},[a("a-row",{attrs:{gutter:24}},[a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-form-item",{attrs:{label:"用户名"}},[a("j-input",{attrs:{placeholder:"请输入名称模糊查询"},model:{value:e.queryParam.name,callback:function(t){e.$set(e.queryParam,"name",t)},expression:"queryParam.name"}})],1)],1),a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-form-item",{attrs:{label:"年龄"}},[a("a-input",{staticStyle:{width:"calc(50% - 15px)"},attrs:{placeholder:"最小年龄",type:"ge"},model:{value:e.queryParam.age_begin,callback:function(t){e.$set(e.queryParam,"age_begin",t)},expression:"queryParam.age_begin"}}),a("span",{staticClass:"group-query-strig"},[e._v("~")]),a("a-input",{staticStyle:{width:"calc(50% - 15px)"},attrs:{placeholder:"最大年龄",type:"le"},model:{value:e.queryParam.age_end,callback:function(t){e.$set(e.queryParam,"age_end",t)},expression:"queryParam.age_end"}})],1)],1),e.toggleSearchStatus?[a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-form-item",{attrs:{label:"生日"}},[a("a-range-picker",{attrs:{format:"YYYY-MM-DD",placeholder:["开始时间","结束时间"]},on:{change:e.onBirthdayChange},model:{value:e.queryParam.birthdayRange,callback:function(t){e.$set(e.queryParam,"birthdayRange",t)},expression:"queryParam.birthdayRange"}})],1)],1),a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-form-item",{attrs:{label:"性别"}},[a("j-dict-select-tag",{attrs:{placeholder:"请选择性别",dictCode:"sex"},model:{value:e.queryParam.sex,callback:function(t){e.$set(e.queryParam,"sex",t)},expression:"queryParam.sex"}})],1)],1),a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-form-item",{attrs:{label:"选择用户"}},[a("j-dict-select-tag",{attrs:{placeholder:"请选择用户",dictCode:"demo,name,id"},model:{value:e.queryParam.id,callback:function(t){e.$set(e.queryParam,"id",t)},expression:"queryParam.id"}})],1)],1)]:e._e(),a("span",{staticClass:"table-page-search-submitButtons",staticStyle:{float:"left",overflow:"hidden"}},[a("a-col",{attrs:{xl:6,lg:7,md:8,sm:24}},[a("a-button",{attrs:{type:"primary",icon:"search"},on:{click:e.searchQuery}},[e._v("查询")]),a("a-button",{staticStyle:{"margin-left":"8px"},attrs:{type:"primary",icon:"reload"},on:{click:e.searchReset}},[e._v("重置")]),a("a",{staticStyle:{"margin-left":"8px"},on:{click:e.handleToggleSearch}},[e._v("\n              "+e._s(e.toggleSearchStatus?"收起":"展开")+"\n              "),a("a-icon",{attrs:{type:e.toggleSearchStatus?"up":"down"}})],1)],1)],1)],2)],1)],1),a("div",{staticClass:"table-operator"},[a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.handleAdd}},[e._v("新增")]),a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.jump}},[e._v("创建单据")]),a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.onetomany}},[e._v("一对多")]),a("a-button",{attrs:{type:"primary",icon:"download"},on:{click:function(t){return e.handleExportXls("单表示例")}}},[e._v("导出")]),a("a-upload",{attrs:{name:"file",showUploadList:!1,multiple:!1,headers:e.tokenHeader,action:e.importExcelUrl},on:{change:e.handleImportExcel}},[a("a-button",{attrs:{type:"primary",icon:"import"}},[e._v("导入")])],1),a("j-super-query",{ref:"superQueryModal",attrs:{fieldList:e.fieldList},on:{handleSuperQuery:e.handleSuperQuery}}),e.selectedRowKeys.length>0?a("a-dropdown",[a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",{key:"1",on:{click:e.batchDel}},[a("a-icon",{attrs:{type:"delete"}}),e._v("\n          删除\n        ")],1)],1),a("a-button",{staticStyle:{"margin-left":"8px"}},[e._v(" 批量操作\n        "),a("a-icon",{attrs:{type:"down"}})],1)],1):e._e()],1),a("div",[a("div",{staticClass:"ant-alert ant-alert-info",staticStyle:{"margin-bottom":"16px"}},[a("i",{staticClass:"anticon anticon-info-circle ant-alert-icon"}),e._v(" 已选择 "),a("a",{staticStyle:{"font-weight":"600"}},[e._v(e._s(e.selectedRowKeys.length))]),e._v("项\n      "),a("a",{staticStyle:{"margin-left":"24px"},on:{click:e.onClearSelected}},[e._v("清空")]),a("span",{staticStyle:{float:"right"}},[a("a",{on:{click:function(t){return e.loadData()}}},[a("a-icon",{attrs:{type:"sync"}}),e._v("刷新")],1),a("a-divider",{attrs:{type:"vertical"}}),a("a-popover",{attrs:{title:"自定义列",trigger:"click",placement:"leftBottom"}},[a("template",{slot:"content"},[a("a-checkbox-group",{attrs:{defaultValue:e.settingColumns},on:{change:e.onColSettingsChange},model:{value:e.settingColumns,callback:function(t){e.settingColumns=t},expression:"settingColumns"}},[a("a-row",{staticStyle:{width:"400px"}},[e._l(e.defColumns,(function(t,r){return["rowIndex"!=t.key&&"action"!=t.dataIndex?[a("a-col",{attrs:{span:12}},[a("a-checkbox",{attrs:{value:t.dataIndex}},[a("j-ellipsis",{attrs:{value:t.title,length:10}})],1)],1)]:e._e()]}))],2)],1)],1),a("a",[a("a-icon",{attrs:{type:"setting"}}),e._v("设置")],1)],2)],1)]),a("a-table",{ref:"table",attrs:{size:"middle",bordered:"",rowKey:"id",columns:e.columns,dataSource:e.dataSource,pagination:e.ipagination,loading:e.loading,rowSelection:{selectedRowKeys:e.selectedRowKeys,onChange:e.onSelectChange}},on:{change:e.handleTableChange},scopedSlots:e._u([{key:"action",fn:function(t,r){return a("span",{},[a("a",{on:{click:function(t){return e.handleEdit(r)}}},[e._v("编辑")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-dropdown",[a("a",{staticClass:"ant-dropdown-link"},[e._v("更多 "),a("a-icon",{attrs:{type:"down"}})],1),a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",[a("a-popconfirm",{attrs:{title:"确定删除吗?"},on:{confirm:function(){return e.handleDelete(r.id)}}},[a("a",[e._v("删除")])])],1)],1)],1)],1)}}])},[a("div",{attrs:{slot:"filterDropdown"},slot:"filterDropdown"},[a("a-card",[a("a-checkbox-group",{attrs:{defaultValue:e.settingColumns},on:{change:e.onColSettingsChange},model:{value:e.settingColumns,callback:function(t){e.settingColumns=t},expression:"settingColumns"}},[a("a-row",{staticStyle:{width:"400px"}},[e._l(e.defColumns,(function(t,r){return["rowIndex"!=t.key&&"action"!=t.dataIndex?[a("a-col",{attrs:{span:12}},[a("a-checkbox",{attrs:{value:t.dataIndex}},[a("j-ellipsis",{attrs:{value:t.title,length:10}})],1)],1)]:e._e()]}))],2)],1)],1)],1),a("a-icon",{style:{fontSize:"16px",color:"#108ee9"},attrs:{slot:"filterIcon",type:"setting"},slot:"filterIcon"})],1)],1),a("jeecgDemo-modal",{ref:"modalForm",on:{ok:e.modalFormOk}}),a("JeecgDemoTabsModal",{ref:"jeecgDemoTabsModal",on:{ok:e.modalFormOk}})],1)},n=[],o=a("c943"),i=a("8c6e"),l=a("4349"),s=a("3335"),c=a("89f2"),d=a("b65a"),u=a("2b0e"),m=a("ca00"),p=[{type:"string",value:"name",text:"用户名"},{type:"int",value:"age",text:"年龄"},{type:"date",value:"birthday",text:"生日"}],f={name:"JeecgDemoList",mixins:[d["a"]],components:{JeecgDemoModal:o["default"],JSuperQuery:i["default"],JeecgDemoTabsModal:s["default"],JInput:l["default"]},data:function(){return{description:"单表示例列表",sexDictOptions:[],importExcelUrl:"".concat(window._CONFIG["domianURL"],"/test/jeecgDemo/importExcel"),columns:[],settingColumns:[],defColumns:[{title:"#",dataIndex:"",key:"rowIndex",width:60,align:"center",customRender:function(e,t,a){return parseInt(a)+1}},{title:"姓名",align:"center",dataIndex:"name"},{title:"关键词",align:"center",dataIndex:"keyWord"},{title:"打卡时间",align:"center",dataIndex:"punchTime"},{title:"性别",align:"center",dataIndex:"sex",customRender:function(e){return Object(c["b"])("sex",e)}},{title:"年龄",align:"center",dataIndex:"age"},{title:"生日",align:"center",dataIndex:"birthday"},{title:"邮箱",align:"center",dataIndex:"email"},{title:"个人简介",align:"center",dataIndex:"content"},{title:"操作",dataIndex:"action",align:"center",scopedSlots:{filterDropdown:"filterDropdown",filterIcon:"filterIcon",customRender:"action"}}],url:{list:"/test/jeecgDemo/list",delete:"/test/jeecgDemo/delete",deleteBatch:"/test/jeecgDemo/deleteBatch",exportXlsUrl:"/test/jeecgDemo/exportXls"},fieldList:p}},methods:{getQueryParams:function(){var e={};this.superQueryParams&&(e["superQueryParams"]=encodeURI(this.superQueryParams),e["superQueryMatchType"]=this.superQueryMatchType);var t=Object.assign(e,this.queryParam,this.isorter,this.filters);return t.field=this.getQueryField(),t.pageNo=this.ipagination.current,t.pageSize=this.ipagination.pageSize,delete t.birthdayRange,Object(m["d"])(t)},initDictConfig:function(){var e=this;Object(c["d"])("sex").then((function(t){t.success&&(e.sexDictOptions=t.result)}))},onetomany:function(){this.$refs.jeecgDemoTabsModal.add(),this.$refs.jeecgDemoTabsModal.title="编辑"},jump:function(){this.$router.push({path:"/jeecg/helloworld"})},onBirthdayChange:function(e,t){this.queryParam.birthday_begin=t[0],this.queryParam.birthday_end=t[1]},onColSettingsChange:function(e){var t=this,a=this.$route.name+":colsettings";u["default"].ls.set(a,e,6048e5),this.settingColumns=e;var r=this.defColumns.filter((function(e){return"rowIndex"==e.key||"action"==e.dataIndex||!!t.settingColumns.includes(e.dataIndex)}));this.columns=r},initColumns:function(){var e=this.$route.name+":colsettings",t=u["default"].ls.get(e);if(null==t||void 0==t){var a=[];this.defColumns.forEach((function(e,t,r){a.push(e.dataIndex)})),this.settingColumns=a,this.columns=this.defColumns}else{this.settingColumns=t;var r=this.defColumns.filter((function(e){return"rowIndex"==e.key||"action"==e.dataIndex||!!t.includes(e.dataIndex)}));this.columns=r}}},created:function(){this.initColumns()}},h=f,g=(a("13c7"),a("2877")),y=Object(g["a"])(h,r,n,!1,null,"01c81c68",null);t["default"]=y.exports},3335:function(e,t,a){"use strict";a.r(t);var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{title:e.title,width:1200,visible:e.visible,confirmLoading:e.confirmLoading,cancelText:"关闭"},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form",{attrs:{form:e.form}},[a("a-card",{staticClass:"card",attrs:{bordered:!1}},[a("a-row",{staticClass:"form-row",attrs:{gutter:16}},[a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"任务名"}},[a("a-input",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.name",{rules:[{required:!0,message:"请输入任务名称",whitespace:!0}]}],expression:"[ 'task.name', {rules: [{ required: true, message: '请输入任务名称', whitespace: true}]} ]"}],attrs:{placeholder:"请输入任务名称"}})],1)],1),a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"任务描述"}},[a("a-input",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.description",{rules:[{required:!0,message:"请输入任务描述",whitespace:!0}]}],expression:"['task.description', {rules: [{ required: true, message: '请输入任务描述', whitespace: true}]} ]"}],attrs:{placeholder:"请输入任务描述"}})],1)],1),a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"执行人"}},[a("a-select",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.executor",{rules:[{required:!0,message:"请选择执行人"}]}],expression:"['task.executor',{rules: [{ required: true, message: '请选择执行人'}]}  ]"}],attrs:{placeholder:"请选择执行人"}},[a("a-select-option",{attrs:{value:"黄丽丽"}},[e._v("黄丽丽")]),a("a-select-option",{attrs:{value:"李大刀"}},[e._v("李大刀")])],1)],1)],1)],1),a("a-row",{staticClass:"form-row",attrs:{gutter:16}},[a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"责任人"}},[a("a-select",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.manager",{rules:[{required:!0,message:"请选择责任人"}]}],expression:"['task.manager',  {rules: [{ required: true, message: '请选择责任人'}]} ]"}],attrs:{placeholder:"请选择责任人"}},[a("a-select-option",{attrs:{value:"王伟"}},[e._v("王伟")]),a("a-select-option",{attrs:{value:"李红军"}},[e._v("李红军")])],1)],1)],1),a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"提醒时间"}},[a("a-time-picker",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.time",{rules:[{required:!0,message:"请选择提醒时间"}]}],expression:"['task.time', {rules: [{ required: true, message: '请选择提醒时间'}]} ]"}],staticStyle:{width:"100%"}})],1)],1),a("a-col",{attrs:{lg:8}},[a("a-form-item",{attrs:{label:"任务类型"}},[a("a-select",{directives:[{name:"decorator",rawName:"v-decorator",value:["task.type",{rules:[{required:!0,message:"请选择任务类型"}]}],expression:"['task.type', {rules: [{ required: true, message: '请选择任务类型'}]} ]"}],attrs:{placeholder:"请选择任务类型"}},[a("a-select-option",{attrs:{value:"定时执行"}},[e._v("定时执行")]),a("a-select-option",{attrs:{value:"周期执行"}},[e._v("周期执行")])],1)],1)],1)],1)],1),a("a-tabs",{attrs:{defaultActiveKey:"1"}},[a("a-tab-pane",{key:"1",attrs:{tab:"Tab 1"}},[a("a-table",{attrs:{columns:e.columns,dataSource:e.data,pagination:!1,size:"middle"},scopedSlots:e._u([e._l(["name","workId","department"],(function(t,r){return{key:t,fn:function(n,o,i){return[a("a-tooltip",{attrs:{title:"必填项",defaultVisible:!1,overlayStyle:{color:"red"}}},[o.editable?a("a-input",{key:t,staticStyle:{margin:"-5px 0"},attrs:{value:n,placeholder:e.columns[r].title},on:{change:function(a){return e.handlerRowChange(a.target.value,o.key,t)}}}):[e._v(e._s(n))]],2)]}}})),{key:"operation",fn:function(t,r,n){return[r.editable?[r.isNew?a("span",[a("a",{on:{click:function(t){return e.saveRow(r.key)}}},[e._v("添加")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-popconfirm",{attrs:{title:"是否要删除此行？"},on:{confirm:function(t){return e.removeRow(r.key)}}},[a("a",[e._v("删除")])])],1):a("span",[a("a",{on:{click:function(t){return e.saveRow(r.key)}}},[e._v("保存")]),a("a-divider",{attrs:{type:"vertical"}}),a("a",{on:{click:function(t){return e.cancelEditRow(r.key)}}},[e._v("取消")])],1)]:a("span",[a("a",{on:{click:function(t){return e.editRow(r.key)}}},[e._v("编辑")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-popconfirm",{attrs:{title:"是否要删除此行？"},on:{confirm:function(t){return e.removeRow(r.key)}}},[a("a",[e._v("删除")])])],1)]}}],null,!0)}),a("a-button",{staticStyle:{width:"100%","margin-top":"16px","margin-bottom":"8px"},attrs:{type:"dashed",icon:"plus"},on:{click:e.newRow}},[e._v("新增成员")])],1),a("a-tab-pane",{key:"2",attrs:{tab:"Tab 2",forceRender:""}},[e._v("\n          Content of Tab Pane 2\n        ")]),a("a-tab-pane",{key:"3",attrs:{tab:"Tab 3"}},[e._v("Content of Tab Pane 3")])],1)],1)],1)],1)},n=[],o=a("0fea"),i=a("88bc"),l=a.n(i),s=a("c1df"),c=a.n(s);function d(e){return f(e)||p(e)||m(e)||u()}function u(){throw new TypeError("Invalid attempt to spread non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}function m(e,t){if(e){if("string"===typeof e)return h(e,t);var a=Object.prototype.toString.call(e).slice(8,-1);return"Object"===a&&e.constructor&&(a=e.constructor.name),"Map"===a||"Set"===a?Array.from(e):"Arguments"===a||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(a)?h(e,t):void 0}}function p(e){if("undefined"!==typeof Symbol&&Symbol.iterator in Object(e))return Array.from(e)}function f(e){if(Array.isArray(e))return h(e)}function h(e,t){(null==t||t>e.length)&&(t=e.length);for(var a=0,r=new Array(t);a<t;a++)r[a]=e[a];return r}var g={name:"JeecgDemoTabsModal",data:function(){return{title:"操作",visible:!1,model:{},columns:[{title:"成员姓名",dataIndex:"name",key:"name",width:"20%",scopedSlots:{customRender:"name"}},{title:"工号",dataIndex:"workId",key:"workId",width:"20%",scopedSlots:{customRender:"workId"}},{title:"所属部门",dataIndex:"department",key:"department",width:"40%",scopedSlots:{customRender:"department"}},{title:"操作",key:"action",scopedSlots:{customRender:"operation"}}],data:[{key:"1",name:"小明",workId:"001",editable:!1,department:"行政部"},{key:"2",name:"李莉",workId:"002",editable:!1,department:"IT部"},{key:"3",name:"王小帅",workId:"003",editable:!1,department:"财务部"}],confirmLoading:!1,form:this.$form.createForm(this),validatorRules:{},url:{add:"/test/jeecgDemo/add",edit:"/test/jeecgDemo/edit"}}},created:function(){},methods:{add:function(){this.edit({})},edit:function(e){var t=this;this.form.resetFields(),this.model=Object.assign({},e),this.visible=!0,this.$nextTick((function(){t.form.setFieldsValue(l()(t.model,"name","keyWord","sex","age","email","content")),t.form.setFieldsValue({punchTime:t.model.punchTime?c()(t.model.punchTime,"YYYY-MM-DD HH:mm:ss"):null}),t.form.setFieldsValue({birthday:t.model.birthday?c()(t.model.birthday):null})}))},close:function(){this.$emit("close"),this.visible=!1},handleOk:function(){var e=this,t=this;this.form.validateFields((function(a,r){if(!a){t.confirmLoading=!0;var n="",i="";e.model.id?(n+=e.url.edit,i="put"):(n+=e.url.add,i="post");var l=Object.assign(e.model,r);l.punchTime=l.punchTime?l.punchTime.format("YYYY-MM-DD HH:mm:ss"):null,l.birthday=l.birthday?l.birthday.format():null,Object(o["h"])(n,l,i).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok")):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1,t.close()}))}}))},handleCancel:function(){this.close()},newRow:function(){var e=Math.round((new Date).getTime()).toString();this.data.push({key:e,name:"",workId:"",department:"",editable:!0,isNew:!0})},removeRow:function(e){var t=this.data.filter((function(t){return t.key!==e}));this.data=t},saveRow:function(e){var t=this.data.filter((function(t){return t.key===e}))[0];t.editable=!1,t.isNew=!1},handlerRowChange:function(e,t,a){var r=d(this.data),n=r.filter((function(e){return t===e.key}))[0];n&&(n[a]=e,this.data=r)},editRow:function(e){var t=this.data.filter((function(t){return t.key===e}))[0];t.editable=!t.editable},cancelEditRow:function(e){var t=this.data.filter((function(t){return t.key===e}))[0];t.editable=!1}}},y=g,b=(a("be66"),a("2877")),v=Object(b["a"])(y,r,n,!1,null,"28883139",null);t["default"]=v.exports},"6aad":function(e,t,a){},be66:function(e,t,a){"use strict";var r=a("04a9"),n=a.n(r);n.a},c943:function(e,t,a){"use strict";a.r(t);var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{title:e.title,width:800,visible:e.visible,confirmLoading:e.confirmLoading,cancelText:"关闭"},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form-model",{ref:"form",attrs:{"label-col":e.labelCol,"wrapper-col":e.wrapperCol,model:e.model,rules:e.validatorRules}},[a("a-form-model-item",{attrs:{label:"姓名",required:"",prop:"name",hasFeedback:""}},[a("a-input",{attrs:{placeholder:"请输入姓名"},model:{value:e.model.name,callback:function(t){e.$set(e.model,"name",t)},expression:"model.name"}})],1),a("a-form-model-item",{attrs:{label:"关键词",prop:"keyWord",hasFeedback:""}},[a("a-input",{attrs:{placeholder:"请输入关键词"},model:{value:e.model.keyWord,callback:function(t){e.$set(e.model,"keyWord",t)},expression:"model.keyWord"}})],1),a("a-form-model-item",{attrs:{label:"打卡时间",prop:"punchTime",hasFeedback:""}},[a("a-date-picker",{attrs:{showTime:"",valueFormat:"YYYY-MM-DD HH:mm:ss"},model:{value:e.model.punchTime,callback:function(t){e.$set(e.model,"punchTime",t)},expression:"model.punchTime"}})],1),a("a-form-model-item",{attrs:{label:"性别",prop:"sex",hasFeedback:""}},[a("j-dict-select-tag",{attrs:{type:"radio","trigger-change":!0,dictCode:"sex"},model:{value:e.model.sex,callback:function(t){e.$set(e.model,"sex",t)},expression:"model.sex"}})],1),a("a-form-model-item",{attrs:{label:"年龄",prop:"age",hasFeedback:""}},[a("a-input",{attrs:{placeholder:"请输入年龄"},model:{value:e.model.age,callback:function(t){e.$set(e.model,"age",t)},expression:"model.age"}})],1),a("a-form-model-item",{attrs:{label:"生日",prop:"age",hasFeedback:""}},[a("a-date-picker",{attrs:{valueFormat:"YYYY-MM-DD"},model:{value:e.model.birthday,callback:function(t){e.$set(e.model,"birthday",t)},expression:"model.birthday"}})],1),a("a-form-model-item",{attrs:{label:"邮箱",prop:"email",hasFeedback:""}},[a("a-input",{attrs:{placeholder:"请输入邮箱"},model:{value:e.model.email,callback:function(t){e.$set(e.model,"email",t)},expression:"model.email"}})],1),a("a-form-model-item",{attrs:{label:"个人简介",prop:"content",hasFeedback:""}},[a("a-input",{attrs:{type:"textarea",placeholder:"请输入个人简介"},model:{value:e.model.content,callback:function(t){e.$set(e.model,"content",t)},expression:"model.content"}})],1)],1)],1)],1)},n=[],o=a("0fea"),i={name:"JeecgDemoModal",data:function(){return{title:"操作",visible:!1,model:{},layout:{labelCol:{span:3},wrapperCol:{span:14}},labelCol:{xs:{span:24},sm:{span:3}},wrapperCol:{xs:{span:24},sm:{span:16}},confirmLoading:!1,form:this.$form.createForm(this),validatorRules:{name:[{required:!0,message:"请输入姓名!"},{min:2,max:30,message:"长度在 2 到 30 个字符",trigger:"blur"}],email:[{required:!1,type:"email",message:"邮箱格式不正确",trigger:"blur"}]},url:{add:"/test/jeecgDemo/add",edit:"/test/jeecgDemo/edit"}}},created:function(){},methods:{add:function(){this.edit({})},edit:function(e){this.model=Object.assign({},e),this.visible=!0},close:function(){this.$refs.form.resetFields(),this.$emit("close"),this.visible=!1},handleOk:function(){var e=this,t=this;this.$refs.form.validate((function(a){if(a){t.confirmLoading=!0;var r="",n="";e.model.id?(r+=e.url.edit,n="put"):(r+=e.url.add,n="post"),Object(o["h"])(r,e.model,n).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok")):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1,t.close()}))}}))},handleCancel:function(){this.close()}}},l=i,s=a("2877"),c=Object(s["a"])(l,r,n,!1,null,"64dcf271",null);t["default"]=c.exports}}]);