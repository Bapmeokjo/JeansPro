
/* 글 작성 여부 확인 */
$(document).ready(function() {
    $("#save").click(function() {

        const board1_title_check = $('#board1_title').val();
        const board1_content_check = $('#board1_content').html();

        if(board1_title_check === "" || board1_title_check === null){
            alert("제목을 작성해주세요");
            return false;
        } else if (board1_content_check === "" || board1_content_check === null) {
            alert("내용을 작성해주세요");
            return false;
        } else{
            if (confirm("저장하시겠습니까?")) {
                $("form").submit();
            } else {
                return false;
            }
        }
    });
});

/* 글 작성 (사진 첨부) */
document.addEventListener("DOMContentLoaded", function() {
  const saveButton = document.querySelector('#save');
  if (saveButton) {
    saveButton.addEventListener('click', function() {
      var board1_content = document.querySelector('#board1_content').innerHTML;
      var hiddenInput = document.createElement('input');
      var form = document.querySelector('form');
      hiddenInput.type = 'hidden';
      hiddenInput.name = 'board1_content';
      hiddenInput.value = board1_content;
      form.appendChild(hiddenInput);
    });
  } else {
    console.error("업로드 실패");
  }

  $('.content-file').click(function() {
    $('#photo-input').trigger('click');
  });

  const photoInput = document.getElementById('photo-input');
  const previewContainer = document.querySelector('#board1_content');

  if (photoInput && previewContainer) {
    photoInput.addEventListener('change', function(event) {
      const files = event.target.files;

      for (let i = 0; i < files.length; i++) {
        const file = files[i];
        if (file.type.startsWith('image/')) {
          const reader = new FileReader();
          reader.onload = function(e) {
            const imageSrc = e.target.result;
            createPreviewImage(imageSrc);
          };
          reader.readAsDataURL(file);
        }
      }
    });
  }

  function createPreviewImage(imageSrc) {
    const imageElement = document.createElement('img');
    imageElement.src = imageSrc;
    imageElement.classList.add('preview-image');
    previewContainer.appendChild(imageElement);
  }
});










