<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a>Home</a>
            </li>
            <li>View Category</li>
        </ul>
    </div>

    <div class="page-content">
        <div class="page-header">
            <h1>
                <small>
                    <i class="ace-icon fa fa-angle-double-right"></i>
                    <a href="index.jsp?page=add_category">Add Category</a>
                </small>
            </h1>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <!-- PAGE CONTENT BEGINS -->
                <div class="row">
                    <div class="col-xs-12">
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>#</th><!-- srno -->
                                    <th>CATEGORY NAME</th>
                                    <th>STATUS</th>
                                </tr>
                            </thead>
                            <tbody>
                                    <tr>
                                        <td></td><!-- srno -->
                                        <td></td>
                                        <td></td>
                                    </tr>
                            </tbody>
                        </table>
                    </div> 
                </div> 
                <div class="hr hr-18 dotted hr-double"></div>
            </div> 
        </div> 
    </div>
</div>
<script>
    function confirmDelete() {
        if (confirm("Are your want to delete this record ??")) {
            return true;
        }
        return false;
    }
</script>