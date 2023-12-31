
$(document).ready(function() {
    /* 글 삭제 */
    $("#delete").click(function() {
        var confirmed = confirm("삭제하시겠습니까?");
        if (confirmed) {
            $("form").submit();
            alert("글이 삭제되었습니다.");
        } else {
            return false;
        }
    });

    /* 모달창 */
    const modal = $("#modal");
    const btnModal = $(".btn-modal");
    const modalCommentNoInput = modal.find("input[name='comment3_no']");
    const modalCommentContentInput = modal.find("input[name='comment3_content']");

    const closeBtn = modal.find(".close-area");

    function isModalOn() {
        return modal.css("display") === "none";
    }

    function modalOn() {
        modal.css("display", "flex");
    }

    function modalOff() {
        modal.css("display", "none");
    }

    btnModal.on("click", function() {
        const commentNo = $(this).data("comment-no");
        const commentContent = $(this).closest("li").find(".col-1").text(); // 댓글 내용 가져오기

        modalCommentNoInput.val(commentNo);
        modalCommentContentInput.val(commentContent);                       // 모달 창에 데이터 설정

        modal.css("display", "flex");
    });

    closeBtn.on("click", function() {
        modalOff();
    });

    modal.on("click", function(e) {
        if (!$(e.target).closest(".modal-overlay").length) {
            modalOff();
        }
    });

    $(window).on("keyup", function(e) {
        if (isModalOn() && e.key === "Escape") {
            modalOff();
        }
    });

});

