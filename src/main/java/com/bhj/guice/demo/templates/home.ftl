Hello, ${first + " " + last}!

${widget.message1}
${widget.message2}
${widget.doesntexist!"Nope"}

[#if first == "John" && 1 == 1]
If is true
[#else]
If is false
[/#if]

[#list numbers as n]
${n!"This one is null"}
[/#list]
