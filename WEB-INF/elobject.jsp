<%@ page contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J"%>
<html>
    <head><title>EL�̈ÖكI�u�W�F�N�g</title></head>
    <body>
        <h1>EL�̈ÖكI�u�W�F�N�g</h1>
        <%
            // �X�N���v�g���b�g���g�p���ăN���X�����擾
            String requestClassName = pageContext.getRequest().getClass().getName();
        %>
        <p>JSP�̈ÖكI�u�W�F�N�grequest�̗��p=<%= requestClassName %></p>
        <p>JSP�̈ÖكI�u�W�F�N�grequest�̗��p=${pageContext.request.contextPath}</p>
        <p>JSP�̈ÖكI�u�W�F�N�gsession�̗��p=${pageContext.session.id}</p>

        <p>���N�G�X�g�X�R�[�v�̃f�[�^=${requestScope.test1}</p>
        <p>�Z�b�V�����X�R�[�v�̃f�[�^=${sessionScope.test2}</p>
        <p>�A�v���P�[�V�����X�R�[�v�̃f�[�^=${applicationScope.test3}</p>

        <p>���N�G�X�g���̓p�����[�^�̃f�[�^=${param.input}</p>

        <p>���N�G�X�g���̓p�����[�^�̃f�[�^=${paramValues.input[0]}</p>
        <p>���N�G�X�g���̓p�����[�^�̃f�[�^=${paramValues.input[1]}</p>

        <p>���N�G�X�g�w�b�_�̃f�[�^=${header["user-agent"]}</p>

        <p>�R���e�L�X�g�̏������p�����[�^�̃f�[�^=${initParam.param3}</p>
    </body>
</html>
