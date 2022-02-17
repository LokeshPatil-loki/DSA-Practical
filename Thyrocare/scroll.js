function isInViewport(el) {
    const rect = el.getBoundingClientRect();
    return (
        rect.top >= 0 &&
        rect.left >= 0 &&
        rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
        rect.right <= (window.innerWidth || document.documentElement.clientWidth)

    );
}
let visibleElements = [];
// let i=0;
let timer;
window.addEventListener("scroll",e => {
    clearInterval(timer);
//     i=0;
    timer = setInterval(e => {
//         i++;
        let arr = document.querySelectorAll(".pi-text");
        arr.forEach(element => {
            isVisible = isInViewport(element);
            if(isVisible && element.isPushed == undefined){
                let spanData = element.querySelector("span.hide");
                let jsonObject = JSON.parse(spanData.innerText);
                visibleElements.push(jsonObject)
                element.isPushed = true;
                console.log(jsonObject.name);
            }
        });
        clearInterval(timer);
//         i = 0;
    },1000);
});
